package typings.fluxible

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  /**
    * POST request to the server
    * @param resource name of resourse
    * @param params query string parameters as key-value object
    * @param body json request body
    * @param callback
    */
  def create(
    resource: String,
    params: js.Any,
    body: js.Any,
    callback: js.Function2[/* error */ Error, /* data */ js.Any, Unit]
  ): Unit
  /**
    *
    * @param resource name of resourse
    * @param params query string parameters as key-value object
    * @param callback
    */
  def delete(
    resource: String,
    params: js.Any,
    callback: js.Function2[/* error */ Error, /* data */ js.Any, Unit]
  ): Unit
  /**
    * GET request to the server
    * @param resource name of resourse
    * @param params query string parameters as key-value object
    * @param callback
    */
  def read(
    resource: String,
    params: js.Any,
    callback: js.Function2[/* error */ Error, /* data */ js.Any, Unit]
  ): Unit
  /**
    *
    * @param resource name of resourse
    * @param params query string parameters as key-value object
    * @param body json request body
    * @param callback
    */
  def update(
    resource: String,
    params: js.Any,
    body: js.Any,
    callback: js.Function2[/* error */ Error, /* data */ js.Any, Unit]
  ): Unit
}

object Anon_Body {
  @scala.inline
  def apply(
    create: (String, js.Any, js.Any, js.Function2[/* error */ Error, /* data */ js.Any, Unit]) => Unit,
    delete: (String, js.Any, js.Function2[/* error */ Error, /* data */ js.Any, Unit]) => Unit,
    read: (String, js.Any, js.Function2[/* error */ Error, /* data */ js.Any, Unit]) => Unit,
    update: (String, js.Any, js.Any, js.Function2[/* error */ Error, /* data */ js.Any, Unit]) => Unit
  ): Anon_Body = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction4(create), delete = js.Any.fromFunction3(delete), read = js.Any.fromFunction3(read), update = js.Any.fromFunction4(update))
  
    __obj.asInstanceOf[Anon_Body]
  }
}

