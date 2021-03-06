package typings.stylus

import typings.stylus.stylusMod.Stylus.Nodes.Block
import typings.stylus.stylusMod.Stylus.Nodes.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var __type: String
  var body: Block
  var column: Double
  var filename: String
  var lineno: Double
  var name: String
  var params: Params
}

object Anon_Body {
  @scala.inline
  def apply(
    __type: String,
    body: Block,
    column: Double,
    filename: String,
    lineno: Double,
    name: String,
    params: Params
  ): Anon_Body = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Body]
  }
}

