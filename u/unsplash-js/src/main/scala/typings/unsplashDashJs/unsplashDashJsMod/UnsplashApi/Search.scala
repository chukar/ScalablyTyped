package typings.unsplashDashJs.unsplashDashJsMod.UnsplashApi

import typings.std.Response
import typings.unsplashDashJs.Anon_CollectionsOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Search extends js.Object {
  def collections(keyword: String): js.Promise[Response] = js.native
  def collections(keyword: String, page: Double): js.Promise[Response] = js.native
  def collections(keyword: String, page: Double, perPage: Double): js.Promise[Response] = js.native
  def photos(keyword: String): js.Promise[Response] = js.native
  def photos(keyword: String, page: Double): js.Promise[Response] = js.native
  def photos(keyword: String, page: Double, perPage: Double): js.Promise[Response] = js.native
  def photos(keyword: String, page: Double, perPage: Double, filters: Anon_CollectionsOrientation): js.Promise[Response] = js.native
  def users(keyword: String): js.Promise[Response] = js.native
  def users(keyword: String, page: Double): js.Promise[Response] = js.native
  def users(keyword: String, page: Double, perPage: Double): js.Promise[Response] = js.native
}

