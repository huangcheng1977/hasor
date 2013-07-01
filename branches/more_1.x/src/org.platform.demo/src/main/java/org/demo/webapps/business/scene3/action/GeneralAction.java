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
package org.demo.webapps.business.scene3.action;
import javax.servlet.http.HttpServletRequest;
import org.demo.webapps.business.scene2.service.Scene2_Bean;
import org.moreframework.servlet.action.Controller;
import org.moreframework.servlet.action.RestfulMapping;
import org.moreframework.servlet.action.Var;
import org.moreframework.servlet.action.support.result.Result;
/**
 * 
 * @version : 2013-5-29
 * @author ������ (zyc@byshell.org)
 */
@Controller("/scene3/general")
public class GeneralAction {
    @Result
    @RestfulMapping("/{acc}/{acc}/{pwd}/*")
    public String print(@Var("acc") int[] account, @Var("pwd") String password, HttpServletRequest request, Scene2_Bean bean) {
        System.out.println(account + "\t=\t" + password + "\t" + request);
        return "/index.htm";
    }
}