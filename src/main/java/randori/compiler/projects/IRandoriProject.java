/***
 * Copyright 2013 Teoti Graphix, LLC.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * 
 * 
 * @author Michael Schmalle <mschmalle@teotigraphix.com>
 */

package randori.compiler.projects;

import org.apache.flex.compiler.clients.problems.ProblemQuery;
import org.apache.flex.compiler.projects.IASProject;

import randori.compiler.access.IASProjectAccess;
import randori.compiler.config.IRandoriTargetSettings;
import randori.compiler.config.annotation.IAnnotationManager;
import randori.compiler.plugin.factory.IPluginFactory;

/**
 * @author Michael Schmalle
 */
public interface IRandoriProject extends IASProject
{
    ProblemQuery getProblemQuery();

    IRandoriTargetSettings getTargetSettings();

    IAnnotationManager getAnnotationManager();

    IASProjectAccess getProjectAccess();

    boolean configure(String[] args);

    boolean compile(boolean doBuild);

    boolean compile(boolean doBuild, boolean doExport);

    IPluginFactory getPluginFactory();
}
