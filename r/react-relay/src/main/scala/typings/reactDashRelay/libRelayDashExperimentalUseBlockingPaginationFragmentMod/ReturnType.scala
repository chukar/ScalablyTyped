package typings.reactDashRelay.libRelayDashExperimentalUseBlockingPaginationFragmentMod

import typings.reactDashRelay.Anon_Arg
import typings.reactDashRelay.libRelayDashExperimentalUseLoadMoreFunctionMod.LoadMoreFn
import typings.reactDashRelay.libRelayDashExperimentalUseRefetchableFragmentNodeMod.Options
import typings.reactDashRelay.libRelayDashExperimentalUseRefetchableFragmentNodeMod.RefetchFnDynamic
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Disposable
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnType[TQuery /* <: OperationType */, TKey, TFragmentData] extends js.Object {
  var data: TFragmentData
  var hasNext: Boolean
  var hasPrevious: Boolean
  var loadNext: LoadMoreFn
  var loadPrevious: LoadMoreFn
  var refetch: RefetchFnDynamic[TQuery, TKey, Options]
}

object ReturnType {
  @scala.inline
  def apply[TQuery /* <: OperationType */, TKey, TFragmentData](
    data: TFragmentData,
    hasNext: Boolean,
    hasPrevious: Boolean,
    loadNext: (/* count */ Double, /* options */ js.UndefOr[Anon_Arg]) => Disposable,
    loadPrevious: (/* count */ Double, /* options */ js.UndefOr[Anon_Arg]) => Disposable,
    refetch: RefetchFnDynamic[TQuery, TKey, Options]
  ): ReturnType[TQuery, TKey, TFragmentData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], hasNext = hasNext.asInstanceOf[js.Any], hasPrevious = hasPrevious.asInstanceOf[js.Any], loadNext = js.Any.fromFunction2(loadNext), loadPrevious = js.Any.fromFunction2(loadPrevious), refetch = refetch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReturnType[TQuery, TKey, TFragmentData]]
  }
}

