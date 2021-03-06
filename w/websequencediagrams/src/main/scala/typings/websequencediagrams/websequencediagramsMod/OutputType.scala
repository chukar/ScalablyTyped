package typings.websequencediagrams.websequencediagramsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.websequencediagrams.websequencediagramsStrings.png
  - typings.websequencediagrams.websequencediagramsStrings.svg
  - typings.websequencediagrams.websequencediagramsStrings.pdf
*/
trait OutputType extends js.Object

object OutputType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pdf: typings.websequencediagrams.websequencediagramsStrings.pdf = this.cast("pdf")
  @scala.inline
  def png: typings.websequencediagrams.websequencediagramsStrings.png = this.cast("png")
  @scala.inline
  def svg: typings.websequencediagrams.websequencediagramsStrings.svg = this.cast("svg")
}

