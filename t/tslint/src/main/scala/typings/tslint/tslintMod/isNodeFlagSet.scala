package typings.tslint.tslintMod

import typings.typescript.typescriptMod.Node
import typings.typescript.typescriptMod.NodeFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "isNodeFlagSet")
@js.native
object isNodeFlagSet extends js.Object {
  def apply(node: Node, flagToCheck: NodeFlags): Boolean = js.native
}

