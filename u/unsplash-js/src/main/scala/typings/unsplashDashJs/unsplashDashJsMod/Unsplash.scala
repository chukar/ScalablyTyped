package typings.unsplashDashJs.unsplashDashJsMod

import typings.std.Response
import typings.unsplashDashJs.Anon_Body
import typings.unsplashDashJs.unsplashDashJsMod.UnsplashApi.Auth
import typings.unsplashDashJs.unsplashDashJsMod.UnsplashApi.Collections
import typings.unsplashDashJs.unsplashDashJsMod.UnsplashApi.CurrentUser
import typings.unsplashDashJs.unsplashDashJsMod.UnsplashApi.Photo
import typings.unsplashDashJs.unsplashDashJsMod.UnsplashApi.Search
import typings.unsplashDashJs.unsplashDashJsMod.UnsplashApi.Stats
import typings.unsplashDashJs.unsplashDashJsMod.UnsplashApi.Users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unsplash extends js.Object {
  var auth: Auth
  var collections: Collections
  var currentUser: CurrentUser
  var photos: Photo
  var search: Search
  var stats: Stats
  var users: Users
  def request(requestOptions: Anon_Body): js.Promise[Response]
}

object Unsplash {
  @scala.inline
  def apply(
    auth: Auth,
    collections: Collections,
    currentUser: CurrentUser,
    photos: Photo,
    request: Anon_Body => js.Promise[Response],
    search: Search,
    stats: Stats,
    users: Users
  ): Unsplash = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], currentUser = currentUser.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], request = js.Any.fromFunction1(request), search = search.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Unsplash]
  }
}

