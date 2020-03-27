package com.janlei.filter;

import javax.servlet.*;
import java.io.IOException;
import java.rmi.server.ExportException;

public class JLFilter implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        try {
            filterChain.doFilter(servletRequest,servletResponse);
        }catch (ExportException e){
            Throwable throwable = e;
            if(throwable instanceof JLException){
                JLException jlException = (JLException) throwable;
            }

        }

    }
}
