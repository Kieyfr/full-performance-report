package com.xydz.fullperformancereport.config;

import com.xydz.fullperformancereport.pojo.entity.User;
import com.xydz.fullperformancereport.util.JwtUtil;
import com.xydz.fullperformancereport.util.LoginUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author xiachenchen
 * @ClassName: LoginHandlerInterceptor
 * @Description: 拦截器 TODO
 * @Date 2022/11/22
*/

@Component
public class LoginHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("accessToken");

        /**
         * 如果不是映射到方法不拦截 直接通过
         */
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }

        /**
         * 验证token
         */
        if (null == token || "".equals(token) || !JwtUtil.verify(token)) {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json; charset=utf-8");
            return false;
        }

        User user = JwtUtil.getUserByToken(token);
        LoginUtil.setLoginUser(user);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        LoginUtil.remove();
    }
}
