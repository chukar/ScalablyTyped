package typings.wxDashJsDashSdkDashDt.wx

import typings.wxDashJsDashSdkDashDt.Anon_LocalIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseImageConfig extends js.Object {
  /**
    * 照片数，默认9
    */
  var count: js.UndefOr[Double] = js.undefined
  /**
    * 可以指定是原图还是压缩图，默认二者都有
    */
  var sizeType: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * 可以指定来源是相册还是相机，默认二者都有
    */
  var sourceType: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * 返回选定照片的本地ID列表，localId可以作为img标签的src属性显示图片
    */
  def success(res: Anon_LocalIds): Unit
}

object ChooseImageConfig {
  @scala.inline
  def apply(
    success: Anon_LocalIds => Unit,
    count: Int | Double = null,
    sizeType: js.Array[String] = null,
    sourceType: js.Array[String] = null
  ): ChooseImageConfig = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (sizeType != null) __obj.updateDynamic("sizeType")(sizeType.asInstanceOf[js.Any])
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseImageConfig]
  }
}

