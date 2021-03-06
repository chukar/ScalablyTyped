package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeOperator
  extends Node
     with TSType {
  var operator: String | Null
  var typeAnnotation: TSType
  @JSName("type")
  var type_TSTypeOperator: typings.babelDashTypes.babelDashTypesStrings.TSTypeOperator
}

@JSImport("babel-types", "TSTypeOperator")
@js.native
object TSTypeOperator extends js.Object {
  def apply(typeAnnotation: TSType): TSTypeOperator = js.native
}

