package typings.naverDashWhale.whale.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginsContentSetting
  extends typings.chrome.chrome.contentSettings.ContentSetting {
  def set(details: typings.chrome.chrome.contentSettings.PluginsSetDetails): Unit = js.native
  def set(details: typings.chrome.chrome.contentSettings.PluginsSetDetails, callback: js.Function0[Unit]): Unit = js.native
}

