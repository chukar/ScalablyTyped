package typings.atJupyterlabApplication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppSettings extends js.Object {
  val appSettings: String
  val schemas: String
  val serverRoot: String
  val static: String
  val templates: String
  val themes: String
  val userSettings: String
  val workspaces: String
}

object Anon_AppSettings {
  @scala.inline
  def apply(
    appSettings: String,
    schemas: String,
    serverRoot: String,
    static: String,
    templates: String,
    themes: String,
    userSettings: String,
    workspaces: String
  ): Anon_AppSettings = {
    val __obj = js.Dynamic.literal(appSettings = appSettings.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], serverRoot = serverRoot.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], themes = themes.asInstanceOf[js.Any], userSettings = userSettings.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AppSettings]
  }
}

