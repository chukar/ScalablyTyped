package typings.cordovaUnderscoreAppUnderscoreVersionUnderscorePlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  /**
    * cordova_app_version_plugin interface
    */
  var version: typings.cordovaUnderscoreAppUnderscoreVersionUnderscorePlugin.CordovaAppVersionPlugin.CordovaAppVersionPlugin
}

object CordovaPlugins {
  @scala.inline
  def apply(
    version: typings.cordovaUnderscoreAppUnderscoreVersionUnderscorePlugin.CordovaAppVersionPlugin.CordovaAppVersionPlugin
  ): CordovaPlugins = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CordovaPlugins]
  }
}

