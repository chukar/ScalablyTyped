package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.rt
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_rt extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: rt): ElementNode[rt, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: rt, children: Content*): ElementNode[rt, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: rt, props: Props[E], children: Content*): ElementNode[rt, E] = js.native
}

