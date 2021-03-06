package typings.naverDashWhale.whale.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromeSetting extends js.Object {
  /** Fired after the setting changes. */
  var onChange: typings.chrome.chrome.types.ChromeSettingChangedEvent = js.native
  /**
    * Clears the setting, restoring any default value.
    * @param details Which setting to clear.
    * @param callback Optional. Called at the completion of the clear operation.
    */
  def clear(details: typings.chrome.chrome.types.ChromeSettingClearDetails): Unit = js.native
  def clear(details: typings.chrome.chrome.types.ChromeSettingClearDetails, callback: js.Function): Unit = js.native
  /**
    * Gets the value of a setting.
    * @param details Which setting to consider.
    */
  def get(details: typings.chrome.chrome.types.ChromeSettingGetDetails): Unit = js.native
  def get(
    details: typings.chrome.chrome.types.ChromeSettingGetDetails,
    callback: typings.chrome.chrome.types.DetailsCallback
  ): Unit = js.native
  /**
    * Sets the value of a setting.
    * @param details Which setting to change.
    * @param callback Optional. Called at the completion of the set operation.
    */
  def set(details: typings.chrome.chrome.types.ChromeSettingSetDetails): Unit = js.native
  def set(details: typings.chrome.chrome.types.ChromeSettingSetDetails, callback: js.Function): Unit = js.native
}

