package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.legend
import typings.std.HTMLLegendElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_legend extends js.Object {
  def apply[E /* <: HTMLLegendElement */](`type`: legend): ElementNode[legend, E] = js.native
  def apply[E /* <: HTMLLegendElement */](`type`: legend, children: Content*): ElementNode[legend, E] = js.native
  def apply[E /* <: HTMLLegendElement */](`type`: legend, props: Props[E], children: Content*): ElementNode[legend, E] = js.native
}

