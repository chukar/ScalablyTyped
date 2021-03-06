package typings.jpushDashReactDashNative

import typings.jpushDashReactDashNative.jpushDashReactDashNativeMod.Extra
import typings.jpushDashReactDashNative.jpushDashReactDashNativeStrings.notificationArrived
import typings.jpushDashReactDashNative.jpushDashReactDashNativeStrings.notificationOpened
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentExtras extends js.Object {
  /**
    * 对应“通知内容”字段
    */
  var content: String
  /**
    * 对应“附加内容”字段
    */
  var extras: Extra
  /**
    * 唯一标识通知消息的ID,可用于移除消息
    */
  var messageID: String
  var notificationEventType: notificationArrived | notificationOpened
  /**
    * 对应“通知标题”字段
    */
  var title: String
}

object Anon_ContentExtras {
  @scala.inline
  def apply(
    content: String,
    extras: Extra,
    messageID: String,
    notificationEventType: notificationArrived | notificationOpened,
    title: String
  ): Anon_ContentExtras = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], extras = extras.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any], notificationEventType = notificationEventType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ContentExtras]
  }
}

