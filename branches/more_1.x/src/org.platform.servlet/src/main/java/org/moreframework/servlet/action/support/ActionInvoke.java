/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.moreframework.servlet.action.support;
import java.lang.reflect.Method;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.moreframework.context.AppContext;
/**
 * 
 * @version : 2013-6-5
 * @author ������ (zyc@byshell.org)
 */
public interface ActionInvoke {
    public void initInvoke(AppContext appContext);
    public String[] getHttpMethod();
    public Method getMethod();
    public Object invoke(HttpServletRequest request, HttpServletResponse response, Map<String, Object> overwriteHttpParams) throws ServletException;
    public void destroyInvoke();
}