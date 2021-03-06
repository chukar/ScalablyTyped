package typings.rxDashCoreDashBinding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Rx {
  type AsyncSubject[T] = Subject[T]
  type ReplaySubject[T] = Subject[T]
  type Subject[T] = ISubject[T]
}
