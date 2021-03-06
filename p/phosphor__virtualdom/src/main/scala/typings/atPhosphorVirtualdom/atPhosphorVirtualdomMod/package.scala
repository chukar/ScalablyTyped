package typings.atPhosphorVirtualdom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atPhosphorVirtualdomMod {
  import org.scalablytyped.runtime.StringDictionary

  type ElementAttrs = ElementBaseAttrs with ElementEventAttrs with ElementSpecialAttrs
  type ElementBaseAttrs = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ T in @phosphor/virtualdom.@phosphor/virtualdom.ElementAttrNames ]:? string}
    */ typings.atPhosphorVirtualdom.atPhosphorVirtualdomStrings.ElementBaseAttrs with js.Any
  type ElementDataset = StringDictionary[String]
  type ElementEventAttrs = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ T in keyof @phosphor/virtualdom.@phosphor/virtualdom.ElementEventMap ]:? (this : std.HTMLElement, event : @phosphor/virtualdom.@phosphor/virtualdom.ElementEventMap[T]): any}
    */ typings.atPhosphorVirtualdom.atPhosphorVirtualdomStrings.ElementEventAttrs with ElementEventMap
  type ElementInlineStyle = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ T in @phosphor/virtualdom.@phosphor/virtualdom.CSSPropertyNames ]:? string}
    */ typings.atPhosphorVirtualdom.atPhosphorVirtualdomStrings.ElementInlineStyle with js.Any
}
