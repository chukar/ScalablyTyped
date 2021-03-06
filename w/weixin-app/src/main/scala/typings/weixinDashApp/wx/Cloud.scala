package typings.weixinDashApp.wx

import typings.weixinDashApp.Anon_Env
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 云开发
// 文档：https://developers.weixin.qq.com/miniprogram/dev/wxcloud/basis/getting-started.html
trait Cloud extends js.Object {
  /**
  		 * 接受一个 name 参数，指定需引用的集合名称
  		 */
  def collection(name: String): js.Object
  /**
  		 * 接受一个可选对象参数 env：环境 ID，获取数据库的引用
  		 */
  def database(options: Anon_Env): js.Object
  /**
  		 * 初始化方法（全局只需一次）
  		 */
  def init(options: InitCloudOptions): Unit
}

object Cloud {
  @scala.inline
  def apply(collection: String => js.Object, database: Anon_Env => js.Object, init: InitCloudOptions => Unit): Cloud = {
    val __obj = js.Dynamic.literal(collection = js.Any.fromFunction1(collection), database = js.Any.fromFunction1(database), init = js.Any.fromFunction1(init))
  
    __obj.asInstanceOf[Cloud]
  }
}

