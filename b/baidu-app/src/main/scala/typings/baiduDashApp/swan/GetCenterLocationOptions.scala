package typings.baiduDashApp.swan

import typings.baiduDashApp.Anon_Latitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 位置-----地图组件控制
trait GetCenterLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MGetCenterLocationOptions(res: Anon_Latitude): Unit
}

object GetCenterLocationOptions {
  @scala.inline
  def apply(
    success: Anon_Latitude => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): GetCenterLocationOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetCenterLocationOptions]
  }
}

