package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief hex 编码与解码模块
	* @detail 引用方式：,```JavaScript,var encoding = require('encoding');,var hex = encoding.hex;,```,或者,```JavaScript,var hex = require('hex');,```
	*/
@JSImport("hex", JSImport.Namespace)
@js.native
object hexMod extends js.Object {
  def decode(data: String): Class_Buffer = js.native
  def encode(data: Class_Buffer): String = js.native
}

