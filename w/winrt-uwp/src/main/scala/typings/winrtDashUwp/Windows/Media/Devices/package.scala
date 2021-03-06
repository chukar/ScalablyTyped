package typings.winrtDashUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Devices {
  import typings.winrtDashUwp.Windows.WinRTEvent

  /** Handles the AnswerRequested and AudioTransferRequested events. */
  type CallControlEventHandler = js.Function1[/* ev */ WinRTEvent[CallControl], Unit]
  /** Handles the DialRequested event. */
  type DialRequestedEventHandler = js.Function1[/* ev */ DialRequestedEventArgs with WinRTEvent[CallControl], Unit]
  /** Handles the KeypadPressed event. */
  type KeypadPressedEventHandler = js.Function1[/* ev */ KeypadPressedEventArgs with WinRTEvent[CallControl], Unit]
  /** Handles the RedialRequested event. */
  type RedialRequestedEventHandler = js.Function1[/* ev */ RedialRequestedEventArgs with WinRTEvent[CallControl], Unit]
}
