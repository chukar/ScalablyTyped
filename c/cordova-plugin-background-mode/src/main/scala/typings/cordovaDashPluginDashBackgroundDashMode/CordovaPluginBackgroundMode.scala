package typings.cordovaDashPluginDashBackgroundDashMode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPluginBackgroundMode extends js.Object {
  /**
    * Configure the default background notification
    */
  def configure(item: ICordovaPluginBackgroundModeNotificationItem): Unit
  /**
    * The background mode can be disabled
    */
  def disable(): Unit
  /**
    * The background mode can be enabled
    */
  def enable(): Unit
  /**
    * Checks if the background mode is activated or not
    */
  def isActivated(): Boolean
  /**
    * Checks if the background mode is enabled or not
    */
  def isEnabled(): Boolean
  /**
    * Function to get notified when the background mode has been activated
    */
  def onactivate(): Unit
  /**
    * Function to get notified when the background mode has been deactivated
    */
  def ondeactivate(): Unit
  /**
    * Function to get notified when the background could not benn activated
    */
  def onfailure(callback: js.Function1[/* errorCode */ Double, Unit]): Unit
  /**
    * Customize default title, ticker and text for the notification
    */
  def setDefaults(item: ICordovaPluginBackgroundModeNotificationItem): Unit
}

object CordovaPluginBackgroundMode {
  @scala.inline
  def apply(
    configure: ICordovaPluginBackgroundModeNotificationItem => Unit,
    disable: () => Unit,
    enable: () => Unit,
    isActivated: () => Boolean,
    isEnabled: () => Boolean,
    onactivate: () => Unit,
    ondeactivate: () => Unit,
    onfailure: js.Function1[/* errorCode */ Double, Unit] => Unit,
    setDefaults: ICordovaPluginBackgroundModeNotificationItem => Unit
  ): CordovaPluginBackgroundMode = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), isActivated = js.Any.fromFunction0(isActivated), isEnabled = js.Any.fromFunction0(isEnabled), onactivate = js.Any.fromFunction0(onactivate), ondeactivate = js.Any.fromFunction0(ondeactivate), onfailure = js.Any.fromFunction1(onfailure), setDefaults = js.Any.fromFunction1(setDefaults))
  
    __obj.asInstanceOf[CordovaPluginBackgroundMode]
  }
}

