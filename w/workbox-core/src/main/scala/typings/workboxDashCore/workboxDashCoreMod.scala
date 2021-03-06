package typings.workboxDashCore

import typings.std.Partial
import typings.workboxDashCore.cacheNamesMod.CacheNames
import typings.workboxDashCore.setCacheNameDetailsMod.CacheNameDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-core", JSImport.Namespace)
@js.native
object workboxDashCoreMod extends js.Object {
  val cacheNames: CacheNames = js.native
  def clientsClaim(): Unit = js.native
  def registerQuotaErrorCallback(callback: js.Function0[Unit]): Unit = js.native
  def setCacheNameDetails(details: Partial[CacheNameDetails]): Unit = js.native
  def skipWaiting(): Unit = js.native
}

