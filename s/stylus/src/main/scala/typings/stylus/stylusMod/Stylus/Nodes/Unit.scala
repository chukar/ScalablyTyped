package typings.stylus.stylusMod.Stylus.Nodes

import typings.stylus.Anon_Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unit extends Node {
  var `type`: java.lang.String
  var `val`: Double
}

object Unit {
  @scala.inline
  def apply(
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    lineno: Double,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Anon_Column,
    `type`: java.lang.String,
    `val`: Double
  ): Unit = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = js.Any.fromFunction0(eval), filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unit]
  }
}

