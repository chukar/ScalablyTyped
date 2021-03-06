package typings.eslint.eslintMod.Scope

import typings.estree.estreeMod.Identifier
import typings.estree.estreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reference extends js.Object {
  var from: typings.eslint.eslintMod.Scope.Scope
  var identifier: Identifier
  var init: Boolean
  var resolved: Variable | Null
  var writeExpr: Node | Null
  def isRead(): Boolean
  def isReadOnly(): Boolean
  def isReadWrite(): Boolean
  def isWrite(): Boolean
  def isWriteOnly(): Boolean
}

object Reference {
  @scala.inline
  def apply(
    from: typings.eslint.eslintMod.Scope.Scope,
    identifier: Identifier,
    init: Boolean,
    isRead: () => Boolean,
    isReadOnly: () => Boolean,
    isReadWrite: () => Boolean,
    isWrite: () => Boolean,
    isWriteOnly: () => Boolean,
    resolved: Variable = null,
    writeExpr: Node = null
  ): Reference = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], isRead = js.Any.fromFunction0(isRead), isReadOnly = js.Any.fromFunction0(isReadOnly), isReadWrite = js.Any.fromFunction0(isReadWrite), isWrite = js.Any.fromFunction0(isWrite), isWriteOnly = js.Any.fromFunction0(isWriteOnly))
    if (resolved != null) __obj.updateDynamic("resolved")(resolved.asInstanceOf[js.Any])
    if (writeExpr != null) __obj.updateDynamic("writeExpr")(writeExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
}

