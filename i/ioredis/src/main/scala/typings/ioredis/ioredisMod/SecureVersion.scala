package typings.ioredis.ioredisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ioredis.ioredisStrings.TLSv1Dot3
  - typings.ioredis.ioredisStrings.TLSv1Dot2
  - typings.ioredis.ioredisStrings.TLSv1Dot1
  - typings.ioredis.ioredisStrings.TLSv1
*/
trait SecureVersion extends js.Object

object SecureVersion {
  @scala.inline
  def TLSv1: typings.ioredis.ioredisStrings.TLSv1 = this.cast("TLSv1")
  @scala.inline
  def TLSv1Dot1: typings.ioredis.ioredisStrings.TLSv1Dot1 = this.cast("TLSv1.1")
  @scala.inline
  def TLSv1Dot2: typings.ioredis.ioredisStrings.TLSv1Dot2 = this.cast("TLSv1.2")
  @scala.inline
  def TLSv1Dot3: typings.ioredis.ioredisStrings.TLSv1Dot3 = this.cast("TLSv1.3")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

