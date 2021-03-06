package typings.atHapiNes.atHapiNesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Socket extends js.Object {
  var app: js.Object
  var auth: SocketAuthObject
  var id: String
  def disconnect(): js.Promise[_]
  def publish(path: String, message: js.Any): js.Promise[_]
  def revoke(path: String, message: js.Any): js.Promise[_]
  def send(message: js.Any): js.Promise[_]
}

object Socket {
  @scala.inline
  def apply(
    app: js.Object,
    auth: SocketAuthObject,
    disconnect: () => js.Promise[_],
    id: String,
    publish: (String, js.Any) => js.Promise[_],
    revoke: (String, js.Any) => js.Promise[_],
    send: js.Any => js.Promise[_]
  ): Socket = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], disconnect = js.Any.fromFunction0(disconnect), id = id.asInstanceOf[js.Any], publish = js.Any.fromFunction2(publish), revoke = js.Any.fromFunction2(revoke), send = js.Any.fromFunction1(send))
  
    __obj.asInstanceOf[Socket]
  }
}

