package typings.jsonDashQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonDashQueryMod {
  import org.scalablytyped.runtime.StringDictionary

  type Context = js.Any
  type Filter = js.Function2[/* input */ Context, /* repeated */ js.Any, Context]
  type Locals = StringDictionary[Filter]
  type QueryParam = js.Any
  type Selector = String
  // No way to support [Selector, ...QueryParam[]]?
  // 10 params should be more than enough, hopefully.
  type SelectorWithQueryParams = (js.Tuple2[Selector, QueryParam]) | (js.Tuple3[Selector, QueryParam, QueryParam]) | (js.Tuple4[Selector, QueryParam, QueryParam, QueryParam]) | (js.Tuple5[Selector, QueryParam, QueryParam, QueryParam, QueryParam]) | (js.Tuple6[Selector, QueryParam, QueryParam, QueryParam, QueryParam, QueryParam]) | (js.Tuple7[Selector, QueryParam, QueryParam, QueryParam, QueryParam, QueryParam, QueryParam]) | (js.Tuple8[Selector, QueryParam, QueryParam, QueryParam, QueryParam, QueryParam, QueryParam, QueryParam]) | (js.Tuple9[
    Selector, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam
  ]) | (js.Tuple10[
    Selector, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam
  ]) | (js.Tuple11[
    Selector, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam
  ])
}
