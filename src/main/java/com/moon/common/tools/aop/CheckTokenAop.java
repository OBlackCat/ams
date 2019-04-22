package com.moon.common.tools.aop;//package com.example.common.tools.aop;
//
//import com.example.common.tools.exception.ExceptionManager;
//import lombok.extern.apachecommons.CommonsLog;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//
///**
// * Created by Tom on 2017/12/6.
// * 校验并获取用户信息Aop
// */
//@Component
//@Aspect
//@CommonsLog
//public class CheckTokenAop {
//
//    @Resource
//    RedisTemplate redisTemplate;
//    @Resource
//    ExceptionManager exceptionManager;
//
//    @Around(value = "execution(* com.example..controller.*.*(..))")
//    public void saveLoginUserInfo(ProceedingJoinPoint joinPoint) {
//
//        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
//
//        String accessToken = request.getHeader("accessToken");
//
//
//        try {
//            joinPoint.proceed();
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
//
//    }
//
//
////    public Object checkTokenAndInjectUser(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
////
////        String code;
////            // 从域的Header中获取ticket
////            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
////            String token = request.getHeader("token");
////            log.info("token - " + token);
////            if (StringUtils.isEmpty(token)) {
////                exceptionManager.create("");
////            }
////
////            code = stringRedisTemplate.opsForValue().get(token);
////            log.info("登陆用户 - " + code);
////
////            if (StringUtils.isEmpty(code)) {
////                exceptionManager.create("");
////        }
////        //注入指定BIP账号的用户信息
////        this.setAopResourceUserInfoDTO(userService.getByBip(code));
////
////    }
////
////    /**
////     * by:Tom
////     * on:2017-11-30 00:50:35
////     * des:注入用户单例
////     */
////    private AopResourceUserInfoBean setAopResourceUserInfoDTO(UserResponseDTO userResponse){
////        //注入用户信息单例
////        AopResourceUserInfoBean aopResourceUserInfoBean =
////                applicationContext.getBean(AopResourceUserInfoBean.class);
////        aopResourceUserInfoBean.setId(userResponse.getId());
////        aopResourceUserInfoBean.setMdmCode(userResponse.getMdmCode());
////        aopResourceUserInfoBean.setBip(userResponse.getBip());
////        aopResourceUserInfoBean.setName(userResponse.getName());
////        aopResourceUserInfoBean.setShorthand(userResponse.getShorthand());
////
////        return aopResourceUserInfoBean;
////    }
//}
//
//
