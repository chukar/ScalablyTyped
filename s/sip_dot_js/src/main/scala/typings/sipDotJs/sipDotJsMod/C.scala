package typings.sipDotJs.sipDotJsMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.sipDotJs.sipDotJsStrings.`0Dot15Dot10`
import typings.sipDotJs.sipDotJsStrings.sip
import typings.sipDotJs.sipDotJsStrings.sips
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "C")
@js.native
object C extends js.Object {
  val ACK: typings.sipDotJs.sipDotJsStrings.ACK = js.native
  val BYE: typings.sipDotJs.sipDotJsStrings.BYE = js.native
  val CANCEL: typings.sipDotJs.sipDotJsStrings.CANCEL = js.native
  val INFO: typings.sipDotJs.sipDotJsStrings.INFO = js.native
  val INVITE: typings.sipDotJs.sipDotJsStrings.INVITE = js.native
  val MESSAGE: typings.sipDotJs.sipDotJsStrings.MESSAGE = js.native
  val NOTIFY: typings.sipDotJs.sipDotJsStrings.NOTIFY = js.native
  val OPTIONS: typings.sipDotJs.sipDotJsStrings.OPTIONS = js.native
  val PRACK: typings.sipDotJs.sipDotJsStrings.PRACK = js.native
  val PUBLISH: typings.sipDotJs.sipDotJsStrings.PUBLISH = js.native
  val REFER: typings.sipDotJs.sipDotJsStrings.REFER = js.native
  val REGISTER: typings.sipDotJs.sipDotJsStrings.REGISTER = js.native
  val SIP: sip = js.native
  val SIPS: sips = js.native
  val SUBSCRIBE: typings.sipDotJs.sipDotJsStrings.SUBSCRIBE = js.native
  val UPDATE: typings.sipDotJs.sipDotJsStrings.UPDATE = js.native
  val USER_AGENT: String = js.native
  val version: `0Dot15Dot10` = js.native
  @js.native
  object OPTION_TAGS extends /* option */ StringDictionary[Boolean]
  
  @js.native
  object REASON_PHRASE extends /* code */ NumberDictionary[String]
  
  @js.native
  object SIP_ERROR_CAUSES
    extends /* name */ StringDictionary[js.Array[Double]]
  
  @js.native
  object causes extends js.Object {
    /* "Address Incomplete" */ val ADDRESS_INCOMPLETE: typings.sipDotJs.libConstantsMod.C.causes.ADDRESS_INCOMPLETE with String = js.native
    /* "Authentication Error" */ val AUTHENTICATION_ERROR: typings.sipDotJs.libConstantsMod.C.causes.AUTHENTICATION_ERROR with String = js.native
    /* "Bad Media Description" */ val BAD_MEDIA_DESCRIPTION: typings.sipDotJs.libConstantsMod.C.causes.BAD_MEDIA_DESCRIPTION with String = js.native
    /* "Busy" */ val BUSY: typings.sipDotJs.libConstantsMod.C.causes.BUSY with String = js.native
    /* "Canceled" */ val CANCELED: typings.sipDotJs.libConstantsMod.C.causes.CANCELED with String = js.native
    /* "Connection Error" */ val CONNECTION_ERROR: typings.sipDotJs.libConstantsMod.C.causes.CONNECTION_ERROR with String = js.native
    /* "Dialog Error" */ val DIALOG_ERROR: typings.sipDotJs.libConstantsMod.C.causes.DIALOG_ERROR with String = js.native
    /* "Expires" */ val EXPIRES: typings.sipDotJs.libConstantsMod.C.causes.EXPIRES with String = js.native
    /* "Incompatible SDP" */ val INCOMPATIBLE_SDP: typings.sipDotJs.libConstantsMod.C.causes.INCOMPATIBLE_SDP with String = js.native
    /* "Internal Error" */ val INTERNAL_ERROR: typings.sipDotJs.libConstantsMod.C.causes.INTERNAL_ERROR with String = js.native
    /* "Not Found" */ val NOT_FOUND: typings.sipDotJs.libConstantsMod.C.causes.NOT_FOUND with String = js.native
    /* "No ACK" */ val NO_ACK: typings.sipDotJs.libConstantsMod.C.causes.NO_ACK with String = js.native
    /* "No Answer" */ val NO_ANSWER: typings.sipDotJs.libConstantsMod.C.causes.NO_ANSWER with String = js.native
    /* "No PRACK" */ val NO_PRACK: typings.sipDotJs.libConstantsMod.C.causes.NO_PRACK with String = js.native
    /* "Redirected" */ val REDIRECTED: typings.sipDotJs.libConstantsMod.C.causes.REDIRECTED with String = js.native
    /* "Rejected" */ val REJECTED: typings.sipDotJs.libConstantsMod.C.causes.REJECTED with String = js.native
    /* "Request Timeout" */ val REQUEST_TIMEOUT: typings.sipDotJs.libConstantsMod.C.causes.REQUEST_TIMEOUT with String = js.native
    /* "RTP Timeout" */ val RTP_TIMEOUT: typings.sipDotJs.libConstantsMod.C.causes.RTP_TIMEOUT with String = js.native
    /* "SIP Failure Code" */ val SIP_FAILURE_CODE: typings.sipDotJs.libConstantsMod.C.causes.SIP_FAILURE_CODE with String = js.native
    /* "Unavailable" */ val UNAVAILABLE: typings.sipDotJs.libConstantsMod.C.causes.UNAVAILABLE with String = js.native
    /* "User Denied Media Access" */ val USER_DENIED_MEDIA_ACCESS: typings.sipDotJs.libConstantsMod.C.causes.USER_DENIED_MEDIA_ACCESS with String = js.native
    /* "WebRTC Error" */ val WEBRTC_ERROR: typings.sipDotJs.libConstantsMod.C.causes.WEBRTC_ERROR with String = js.native
    /* "WebRTC Not Supported" */ val WEBRTC_NOT_SUPPORTED: typings.sipDotJs.libConstantsMod.C.causes.WEBRTC_NOT_SUPPORTED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sipDotJs.libConstantsMod.C.causes with String] = js.native
  }
  
  @js.native
  object dtmfType extends js.Object {
    /* "info" */ val INFO: typings.sipDotJs.libConstantsMod.C.dtmfType.INFO with String = js.native
    /* "rtp" */ val RTP: typings.sipDotJs.libConstantsMod.C.dtmfType.RTP with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sipDotJs.libConstantsMod.C.dtmfType with String] = js.native
  }
  
  @js.native
  object supported extends js.Object {
    /* "required" */ val REQUIRED: typings.sipDotJs.libConstantsMod.C.supported.REQUIRED with String = js.native
    /* "supported" */ val SUPPORTED: typings.sipDotJs.libConstantsMod.C.supported.SUPPORTED with String = js.native
    /* "none" */ val UNSUPPORTED: typings.sipDotJs.libConstantsMod.C.supported.UNSUPPORTED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sipDotJs.libConstantsMod.C.supported with String] = js.native
  }
  
}

