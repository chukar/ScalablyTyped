package typings.sdpDashTransform.sdpDashTransformMod

import typings.sdpDashTransform.Anon_AddressIpVer
import typings.sdpDashTransform.Anon_AddressTypes
import typings.sdpDashTransform.Anon_App
import typings.sdpDashTransform.Anon_Attribute
import typings.sdpDashTransform.Anon_Attrs1
import typings.sdpDashTransform.Anon_Codec
import typings.sdpDashTransform.Anon_ComponentFoundation
import typings.sdpDashTransform.Anon_Config
import typings.sdpDashTransform.Anon_ConfigId
import typings.sdpDashTransform.Anon_ConfigPayload
import typings.sdpDashTransform.Anon_Dir1
import typings.sdpDashTransform.Anon_Direction
import typings.sdpDashTransform.Anon_Hash
import typings.sdpDashTransform.Anon_Payload
import typings.sdpDashTransform.Anon_PayloadValue
import typings.sdpDashTransform.Anon_Semantics
import typings.sdpDashTransform.Anon_Value
import typings.sdpDashTransform.sdpDashTransformStrings.inactive
import typings.sdpDashTransform.sdpDashTransformStrings.recvonly
import typings.sdpDashTransform.sdpDashTransformStrings.sendonly
import typings.sdpDashTransform.sdpDashTransformStrings.sendrecv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaAttributes extends SharedAttributes {
  // a=candidate
  var candidates: js.UndefOr[js.Array[Anon_ComponentFoundation]] = js.undefined
  // a=crypto
  var crypto: js.UndefOr[Anon_ConfigId] = js.undefined
  // a=end-of-candidates
  var endOfCandidates: js.UndefOr[String] = js.undefined
  // a=fmtp
  var fmtp: js.Array[Anon_ConfigPayload]
  // a=framerate
  var framerate: js.UndefOr[Double | String] = js.undefined
  // a=imageattr
  var imageattrs: js.UndefOr[js.Array[Anon_Attrs1]] = js.undefined
  // a=maxptime
  var maxptime: js.UndefOr[Double] = js.undefined
  // a=mid
  var mid: js.UndefOr[String] = js.undefined
  // a=msid
  var msid: js.UndefOr[String] = js.undefined
  var ptime: js.UndefOr[Double] = js.undefined
  // a=remote-candidates
  var remoteCandidates: js.UndefOr[String] = js.undefined
  // a=rid
  var rids: js.UndefOr[js.Array[Anon_Direction]] = js.undefined
  var rtcp: js.UndefOr[Anon_AddressIpVer] = js.undefined
  // a=rtcp-fb:98 nack rpsi
  var rtcpFb: js.UndefOr[Anon_Payload] = js.undefined
  // a=rtcp-fb:98 trr-int 100
  var rtcpFbTrrInt: js.UndefOr[Anon_PayloadValue] = js.undefined
  // a=rtcp-mux
  var rtcpMux: js.UndefOr[String] = js.undefined
  // a=rtcp-rsize
  var rtcpRsize: js.UndefOr[String] = js.undefined
  var rtp: js.Array[Anon_Codec]
  // a=sctpmap
  var sctpmap: js.UndefOr[Anon_App] = js.undefined
  var simulcast: js.UndefOr[Anon_Dir1] = js.undefined
  var simulcast_03: js.UndefOr[Anon_Value] = js.undefined
  // a=ssrc-group:
  var ssrcGroups: js.UndefOr[js.Array[Anon_Semantics]] = js.undefined
  // a=ssrc:
  var ssrcs: js.UndefOr[js.Array[Anon_Attribute]] = js.undefined
  // a=x-google-flag
  var xGoogleFlag: js.UndefOr[String] = js.undefined
}

object MediaAttributes {
  @scala.inline
  def apply(
    fmtp: js.Array[Anon_ConfigPayload],
    rtp: js.Array[Anon_Codec],
    candidates: js.Array[Anon_ComponentFoundation] = null,
    control: String = null,
    crypto: Anon_ConfigId = null,
    direction: sendrecv | recvonly | sendonly | inactive = null,
    endOfCandidates: String = null,
    ext: js.Array[Anon_Config] = null,
    fingerprint: Anon_Hash = null,
    framerate: Double | String = null,
    icePwd: String = null,
    iceUfrag: String = null,
    imageattrs: js.Array[Anon_Attrs1] = null,
    invalid: js.Array[Anon_Value] = null,
    maxptime: Int | Double = null,
    mid: String = null,
    msid: String = null,
    ptime: Int | Double = null,
    remoteCandidates: String = null,
    rids: js.Array[Anon_Direction] = null,
    rtcp: Anon_AddressIpVer = null,
    rtcpFb: Anon_Payload = null,
    rtcpFbTrrInt: Anon_PayloadValue = null,
    rtcpMux: String = null,
    rtcpRsize: String = null,
    sctpmap: Anon_App = null,
    setup: String = null,
    simulcast: Anon_Dir1 = null,
    simulcast_03: Anon_Value = null,
    sourceFilter: Anon_AddressTypes = null,
    ssrcGroups: js.Array[Anon_Semantics] = null,
    ssrcs: js.Array[Anon_Attribute] = null,
    xGoogleFlag: String = null
  ): MediaAttributes = {
    val __obj = js.Dynamic.literal(fmtp = fmtp.asInstanceOf[js.Any], rtp = rtp.asInstanceOf[js.Any])
    if (candidates != null) __obj.updateDynamic("candidates")(candidates.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (crypto != null) __obj.updateDynamic("crypto")(crypto.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (endOfCandidates != null) __obj.updateDynamic("endOfCandidates")(endOfCandidates.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (framerate != null) __obj.updateDynamic("framerate")(framerate.asInstanceOf[js.Any])
    if (icePwd != null) __obj.updateDynamic("icePwd")(icePwd.asInstanceOf[js.Any])
    if (iceUfrag != null) __obj.updateDynamic("iceUfrag")(iceUfrag.asInstanceOf[js.Any])
    if (imageattrs != null) __obj.updateDynamic("imageattrs")(imageattrs.asInstanceOf[js.Any])
    if (invalid != null) __obj.updateDynamic("invalid")(invalid.asInstanceOf[js.Any])
    if (maxptime != null) __obj.updateDynamic("maxptime")(maxptime.asInstanceOf[js.Any])
    if (mid != null) __obj.updateDynamic("mid")(mid.asInstanceOf[js.Any])
    if (msid != null) __obj.updateDynamic("msid")(msid.asInstanceOf[js.Any])
    if (ptime != null) __obj.updateDynamic("ptime")(ptime.asInstanceOf[js.Any])
    if (remoteCandidates != null) __obj.updateDynamic("remoteCandidates")(remoteCandidates.asInstanceOf[js.Any])
    if (rids != null) __obj.updateDynamic("rids")(rids.asInstanceOf[js.Any])
    if (rtcp != null) __obj.updateDynamic("rtcp")(rtcp.asInstanceOf[js.Any])
    if (rtcpFb != null) __obj.updateDynamic("rtcpFb")(rtcpFb.asInstanceOf[js.Any])
    if (rtcpFbTrrInt != null) __obj.updateDynamic("rtcpFbTrrInt")(rtcpFbTrrInt.asInstanceOf[js.Any])
    if (rtcpMux != null) __obj.updateDynamic("rtcpMux")(rtcpMux.asInstanceOf[js.Any])
    if (rtcpRsize != null) __obj.updateDynamic("rtcpRsize")(rtcpRsize.asInstanceOf[js.Any])
    if (sctpmap != null) __obj.updateDynamic("sctpmap")(sctpmap.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(setup.asInstanceOf[js.Any])
    if (simulcast != null) __obj.updateDynamic("simulcast")(simulcast.asInstanceOf[js.Any])
    if (simulcast_03 != null) __obj.updateDynamic("simulcast_03")(simulcast_03.asInstanceOf[js.Any])
    if (sourceFilter != null) __obj.updateDynamic("sourceFilter")(sourceFilter.asInstanceOf[js.Any])
    if (ssrcGroups != null) __obj.updateDynamic("ssrcGroups")(ssrcGroups.asInstanceOf[js.Any])
    if (ssrcs != null) __obj.updateDynamic("ssrcs")(ssrcs.asInstanceOf[js.Any])
    if (xGoogleFlag != null) __obj.updateDynamic("xGoogleFlag")(xGoogleFlag.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaAttributes]
  }
}

