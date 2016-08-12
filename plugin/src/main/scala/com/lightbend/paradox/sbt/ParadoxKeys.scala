/*
 * Copyright © 2015 - 2016 Lightbend, Inc. <http://www.lightbend.com>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lightbend.paradox.sbt

import sbt._
import com.lightbend.paradox.ParadoxProcessor
import com.lightbend.paradox.template.PageTemplate

trait ParadoxKeys {
  val paradox = taskKey[File]("Build the paradox site.")
  val paradoxMarkdownToHtml = taskKey[Seq[(File, String)]]("Convert markdown files to HTML.")
  val paradoxNavigationDepth = settingKey[Int]("Determines depth of TOC for page navigation.")
  val paradoxOrganization = settingKey[String]("Paradox dependency organization (for theme dependencies).")
  val paradoxProcessor = taskKey[ParadoxProcessor]("ParadoxProcessor to use when generating the site.")
  val paradoxProperties = taskKey[Map[String, String]]("Property map passed to paradox.")
  val paradoxSourceSuffix = settingKey[String]("Source file suffix for markdown files [default = \".md\"].")
  val paradoxTargetSuffix = settingKey[String]("Target file suffix for HTML files [default = \".html\"].")
  val paradoxTheme = settingKey[Option[ModuleID]]("Web module name of the paradox theme, otherwise local template.")
  val paradoxThemeDirectory = taskKey[File]("Sync combined theme and local template to a directory.")
  val paradoxTemplate = taskKey[PageTemplate]("PageTemplate to use when generating HTML pages.")
  val paradoxVersion = settingKey[String]("Paradox plugin version.")
}
