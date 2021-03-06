package typings.mirrorx

import typings.mirrorx.mirrorxMod.RouteProps
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object mirrorxComponents extends mirrorxProps {
  @scala.inline
  def Link: ComponentType[LinkProps] = js.constructorOf[typings.mirrorx.mirrorxMod.Link].asInstanceOf[typings.react.reactMod.ComponentType[LinkProps]]
  @scala.inline
  def NavLink: ComponentType[NavLinkProps] = js.constructorOf[typings.mirrorx.mirrorxMod.NavLink].asInstanceOf[typings.react.reactMod.ComponentType[NavLinkProps]]
  @scala.inline
  def Prompt: ComponentType[PromptProps] = js.constructorOf[typings.mirrorx.mirrorxMod.Prompt].asInstanceOf[typings.react.reactMod.ComponentType[PromptProps]]
  @scala.inline
  def Redirect: ComponentType[RedirectProps] = js.constructorOf[typings.mirrorx.mirrorxMod.Redirect].asInstanceOf[typings.react.reactMod.ComponentType[RedirectProps]]
  @scala.inline
  def Route[T /* <: RouteProps */]: ComponentType[T] = js.constructorOf[typings.mirrorx.mirrorxMod.Route[T]].asInstanceOf[typings.react.reactMod.ComponentType[T]]
  @scala.inline
  def Router[State]: ComponentType[RouterProps[State]] = js.constructorOf[typings.mirrorx.mirrorxMod.Router[State]].asInstanceOf[typings.react.reactMod.ComponentType[RouterProps[State]]]
}

