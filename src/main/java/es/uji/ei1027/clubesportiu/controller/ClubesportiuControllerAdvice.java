package es.uji.ei1027.clubesportiu.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ClubesportiuControllerAdvice {

    @ExceptionHandler(value = ClubesportiuException.class)
    public ModelAndView handleClubException(ClubesportiuException ex){

        ModelAndView mav = new ModelAndView("error/exceptionError");
        mav.addObject("message", ex.getMessage());
        mav.addObject("errorName", ex.getErrorName());
        return mav;
    }

}
