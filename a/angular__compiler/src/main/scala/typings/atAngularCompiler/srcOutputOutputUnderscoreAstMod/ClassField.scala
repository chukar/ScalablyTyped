package typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "ClassField")
@js.native
class ClassField protected () extends AbstractClassPart {
  def this(name: String) = this()
  def this(name: String, `type`: Type) = this()
  def this(name: String, `type`: Null, modifiers: js.Array[StmtModifier]) = this()
  def this(name: String, `type`: Type, modifiers: js.Array[StmtModifier]) = this()
  def this(name: String, `type`: Null, modifiers: js.Array[StmtModifier], initializer: Expression) = this()
  def this(name: String, `type`: Null, modifiers: Null, initializer: Expression) = this()
  def this(name: String, `type`: Type, modifiers: js.Array[StmtModifier], initializer: Expression) = this()
  def this(name: String, `type`: Type, modifiers: Null, initializer: Expression) = this()
  var initializer: js.UndefOr[Expression] = js.native
  var name: String = js.native
  def isEquivalent(f: ClassField): Boolean = js.native
}

