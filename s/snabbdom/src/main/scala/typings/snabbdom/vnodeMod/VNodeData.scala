package typings.snabbdom.vnodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.snabbdom.helpersAttachtoMod.AttachData
import typings.snabbdom.hooksMod.Hooks
import typings.snabbdom.modulesAttributesMod.Attrs
import typings.snabbdom.modulesClassMod.Classes
import typings.snabbdom.modulesDatasetMod.Dataset
import typings.snabbdom.modulesEventlistenersMod.On
import typings.snabbdom.modulesHeroMod.Hero
import typings.snabbdom.modulesPropsMod.Props
import typings.snabbdom.modulesStyleMod.VNodeStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNodeData
  extends /* key */ StringDictionary[js.Any] {
  var args: js.UndefOr[js.Array[_]] = js.undefined
  var attachData: js.UndefOr[AttachData] = js.undefined
  var attrs: js.UndefOr[Attrs] = js.undefined
  var `class`: js.UndefOr[Classes] = js.undefined
  var dataset: js.UndefOr[Dataset] = js.undefined
  var fn: js.UndefOr[js.Function0[VNode]] = js.undefined
  var hero: js.UndefOr[Hero] = js.undefined
  var hook: js.UndefOr[Hooks] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var ns: js.UndefOr[String] = js.undefined
  var on: js.UndefOr[On] = js.undefined
  var props: js.UndefOr[Props] = js.undefined
  var style: js.UndefOr[VNodeStyle] = js.undefined
}

object VNodeData {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    args: js.Array[_] = null,
    attachData: AttachData = null,
    attrs: Attrs = null,
    `class`: Classes = null,
    dataset: Dataset = null,
    fn: () => VNode = null,
    hero: Hero = null,
    hook: Hooks = null,
    key: Key = null,
    ns: String = null,
    on: On = null,
    props: Props = null,
    style: VNodeStyle = null
  ): VNodeData = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (attachData != null) __obj.updateDynamic("attachData")(attachData.asInstanceOf[js.Any])
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction0(fn))
    if (hero != null) __obj.updateDynamic("hero")(hero.asInstanceOf[js.Any])
    if (hook != null) __obj.updateDynamic("hook")(hook.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ns != null) __obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNodeData]
  }
}

