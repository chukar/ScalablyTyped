package typings.styledDashSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledDashSystemMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Pick
  import typings.styledDashSystem.styledDashSystemNumbers.`0`
  import typings.styledDashSystem.styledDashSystemStrings.m
  import typings.styledDashSystem.styledDashSystemStrings.mb
  import typings.styledDashSystem.styledDashSystemStrings.ml
  import typings.styledDashSystem.styledDashSystemStrings.mr
  import typings.styledDashSystem.styledDashSystemStrings.mt
  import typings.styledDashSystem.styledDashSystemStrings.mx
  import typings.styledDashSystem.styledDashSystemStrings.my
  import typings.styledDashSystem.styledDashSystemStrings.p
  import typings.styledDashSystem.styledDashSystemStrings.pb
  import typings.styledDashSystem.styledDashSystemStrings.pl
  import typings.styledDashSystem.styledDashSystemStrings.pr
  import typings.styledDashSystem.styledDashSystemStrings.pt
  import typings.styledDashSystem.styledDashSystemStrings.px
  import typings.styledDashSystem.styledDashSystemStrings.py

  type Config = /** Property name exposed for use in components */
  StringDictionary[ConfigStyle | Boolean]
  type MarginBottomProps = Pick[
    SpaceProps[TLengthStyledSystem], 
    mb | typings.styledDashSystem.styledDashSystemStrings.marginBottom
  ]
  type MarginLeftProps = Pick[
    SpaceProps[TLengthStyledSystem], 
    ml | typings.styledDashSystem.styledDashSystemStrings.marginLeft
  ]
  type MarginProps = Pick[
    SpaceProps[TLengthStyledSystem], 
    m | typings.styledDashSystem.styledDashSystemStrings.margin | mt | typings.styledDashSystem.styledDashSystemStrings.marginTop | mb | typings.styledDashSystem.styledDashSystemStrings.marginBottom | ml | typings.styledDashSystem.styledDashSystemStrings.marginLeft | mr | typings.styledDashSystem.styledDashSystemStrings.marginRight | my | mx
  ]
  type MarginRightProps = Pick[
    SpaceProps[TLengthStyledSystem], 
    mr | typings.styledDashSystem.styledDashSystemStrings.marginRight
  ]
  type MarginTopProps = Pick[
    SpaceProps[TLengthStyledSystem], 
    mt | typings.styledDashSystem.styledDashSystemStrings.marginTop
  ]
  type ObjectOrArray[T] = js.Array[T] | (StringDictionary[
    T | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias styled-system.styled-system.ObjectOrArray<T> */ js.Object)
  ])
  type PaddingBottomProps = Pick[
    SpaceProps[TLengthStyledSystem], 
    pb | typings.styledDashSystem.styledDashSystemStrings.paddingBottom
  ]
  type PaddingLeftProps = Pick[
    SpaceProps[TLengthStyledSystem], 
    pl | typings.styledDashSystem.styledDashSystemStrings.paddingLeft
  ]
  type PaddingProps = Pick[
    SpaceProps[TLengthStyledSystem], 
    p | typings.styledDashSystem.styledDashSystemStrings.padding | pt | typings.styledDashSystem.styledDashSystemStrings.paddingTop | pb | typings.styledDashSystem.styledDashSystemStrings.paddingBottom | pl | typings.styledDashSystem.styledDashSystemStrings.paddingLeft | pr | typings.styledDashSystem.styledDashSystemStrings.paddingRight | py | px
  ]
  type PaddingRightProps = Pick[
    SpaceProps[TLengthStyledSystem], 
    pr | typings.styledDashSystem.styledDashSystemStrings.paddingRight
  ]
  type PaddingTopProps = Pick[
    SpaceProps[TLengthStyledSystem], 
    pt | typings.styledDashSystem.styledDashSystemStrings.paddingTop
  ]
  type ResponsiveValue[T] = T | (js.Array[T | Null]) | StringDictionary[T]
  type Scale = ObjectOrArray[Double | String]
  type TLengthStyledSystem = String | `0` | Double
}
