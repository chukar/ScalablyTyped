package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.SyntaxKind.GreaterThanToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "Prose")
@js.native
class Prose protected ()
  extends Node[typings.grammarkdown.distTokensMod.SyntaxKind.Prose] {
  def this(greaterThanToken: Token[GreaterThanToken]) = this()
  def this(greaterThanToken: Token[GreaterThanToken], fragments: js.Array[ProseFragment]) = this()
  val fragments: js.UndefOr[js.Array[ProseFragment]] = js.native
  val greaterThanToken: Token[GreaterThanToken] = js.native
  def update(): Prose = js.native
  def update(fragments: js.Array[ProseFragment]): Prose = js.native
}

