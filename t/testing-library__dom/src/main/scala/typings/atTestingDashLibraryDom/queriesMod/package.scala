package typings.atTestingDashLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object queriesMod {
  import typings.atTestingDashLibraryDom.matchesMod.Matcher
  import typings.atTestingDashLibraryDom.matchesMod.MatcherOptions
  import typings.atTestingDashLibraryDom.queryDashHelpersMod.SelectorMatcherOptions
  import typings.atTestingDashLibraryDom.waitDashForDashElementMod.WaitForElementOptions
  import typings.std.HTMLElement

  type AllByBoundAttribute = js.Function3[
    /* container */ HTMLElement, 
    /* id */ Matcher, 
    /* options */ js.UndefOr[MatcherOptions], 
    js.Array[HTMLElement]
  ]
  type AllByRole = js.Function3[
    /* container */ HTMLElement, 
    /* role */ Matcher, 
    /* options */ js.UndefOr[ByRoleOptions], 
    js.Array[HTMLElement]
  ]
  type AllByText = js.Function3[
    /* container */ HTMLElement, 
    /* id */ Matcher, 
    /* options */ js.UndefOr[SelectorMatcherOptions], 
    js.Array[HTMLElement]
  ]
  type FindAllByBoundAttribute = js.Function4[
    /* container */ HTMLElement, 
    /* id */ Matcher, 
    /* options */ js.UndefOr[MatcherOptions], 
    /* waitForElementOptions */ js.UndefOr[WaitForElementOptions], 
    js.Promise[js.Array[HTMLElement]]
  ]
  type FindAllByRole = js.Function4[
    /* container */ HTMLElement, 
    /* role */ Matcher, 
    /* options */ js.UndefOr[ByRoleOptions], 
    /* waitForElementOptions */ js.UndefOr[WaitForElementOptions], 
    js.Promise[js.Array[HTMLElement]]
  ]
  type FindAllByText = js.Function4[
    /* container */ HTMLElement, 
    /* id */ Matcher, 
    /* options */ js.UndefOr[SelectorMatcherOptions], 
    /* waitForElementOptions */ js.UndefOr[WaitForElementOptions], 
    js.Promise[js.Array[HTMLElement]]
  ]
  type FindByBoundAttribute = js.Function4[
    /* container */ HTMLElement, 
    /* id */ Matcher, 
    /* options */ js.UndefOr[MatcherOptions], 
    /* waitForElementOptions */ js.UndefOr[WaitForElementOptions], 
    js.Promise[HTMLElement]
  ]
  type FindByRole = js.Function4[
    /* container */ HTMLElement, 
    /* role */ Matcher, 
    /* options */ js.UndefOr[ByRoleOptions], 
    /* waitForElementOptions */ js.UndefOr[WaitForElementOptions], 
    js.Promise[HTMLElement]
  ]
  type FindByText = js.Function4[
    /* container */ HTMLElement, 
    /* id */ Matcher, 
    /* options */ js.UndefOr[SelectorMatcherOptions], 
    /* waitForElementOptions */ js.UndefOr[WaitForElementOptions], 
    js.Promise[HTMLElement]
  ]
  type GetByBoundAttribute = js.Function3[
    /* container */ HTMLElement, 
    /* id */ Matcher, 
    /* options */ js.UndefOr[MatcherOptions], 
    HTMLElement
  ]
  type GetByRole = js.Function3[
    /* container */ HTMLElement, 
    /* role */ Matcher, 
    /* options */ js.UndefOr[ByRoleOptions], 
    HTMLElement
  ]
  type GetByText = js.Function3[
    /* container */ HTMLElement, 
    /* id */ Matcher, 
    /* options */ js.UndefOr[SelectorMatcherOptions], 
    HTMLElement
  ]
  type QueryByBoundAttribute = js.Function3[
    /* container */ HTMLElement, 
    /* id */ Matcher, 
    /* options */ js.UndefOr[MatcherOptions], 
    HTMLElement | Null
  ]
  type QueryByRole = js.Function3[
    /* container */ HTMLElement, 
    /* role */ Matcher, 
    /* options */ js.UndefOr[ByRoleOptions], 
    HTMLElement | Null
  ]
  type QueryByText = js.Function3[
    /* container */ HTMLElement, 
    /* id */ Matcher, 
    /* options */ js.UndefOr[SelectorMatcherOptions], 
    HTMLElement | Null
  ]
}
