package typings.wxDashServerDashSdk

import typings.wxDashServerDashSdk.wxDashServerDashSdkStrings.wx_client
import typings.wxDashServerDashSdk.wxDashServerDashSdkStrings.wx_devtools
import typings.wxDashServerDashSdk.wxDashServerDashSdkStrings.wx_http
import typings.wxDashServerDashSdk.wxDashServerDashSdkStrings.wx_unknown
import typings.wxDashServerDashSdk.wxDashServerDashSdkStrings.其他
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_APPID extends js.Object {
  var APPID: String
  var ENV: String
  var OPENID: String
  var SOURCE: wx_devtools | wx_client | wx_http | wx_unknown | 其他
  var UNIONID: String
}

object Anon_APPID {
  @scala.inline
  def apply(
    APPID: String,
    ENV: String,
    OPENID: String,
    SOURCE: wx_devtools | wx_client | wx_http | wx_unknown | 其他,
    UNIONID: String
  ): Anon_APPID = {
    val __obj = js.Dynamic.literal(APPID = APPID.asInstanceOf[js.Any], ENV = ENV.asInstanceOf[js.Any], OPENID = OPENID.asInstanceOf[js.Any], SOURCE = SOURCE.asInstanceOf[js.Any], UNIONID = UNIONID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_APPID]
  }
}

