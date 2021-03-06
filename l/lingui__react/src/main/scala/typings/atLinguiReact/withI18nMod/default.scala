package typings.atLinguiReact.withI18nMod

import typings.atLinguiReact.atLinguiReactStrings.i18n
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/react/withI18n", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(): js.Function1[
    /* WrappedComponent */ ComponentConstructor[_], 
    ComponentClass[Pick[_, Exclude[String, i18n]], ComponentState]
  ] = js.native
  def apply(options: withI18nOptions): js.Function1[
    /* WrappedComponent */ ComponentConstructor[_], 
    ComponentClass[Pick[_, Exclude[String, i18n]], ComponentState]
  ] = js.native
}

