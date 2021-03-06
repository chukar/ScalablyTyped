package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBackgroundAudioPlayerStateOptions extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[NoneParamCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[NoneParamCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetBackgroundAudioPlayerStateSuccessCallback] = js.undefined
}

object GetBackgroundAudioPlayerStateOptions {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: /* state */ BackgroundAudioPlayerState => Unit = null
  ): GetBackgroundAudioPlayerStateOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetBackgroundAudioPlayerStateOptions]
  }
}

