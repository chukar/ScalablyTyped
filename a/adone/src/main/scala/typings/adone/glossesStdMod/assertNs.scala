package typings.adone.glossesStdMod

import typings.assert.Anon_Actual
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "assert")
@js.native
object assertNs extends js.Object {
  @js.native
  class AssertionError ()
    extends typings.assert.assertMod.AssertionError {
    def this(options: Anon_Actual) = this()
  }
  
  def deepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def deepEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def doesNotThrow(block: js.Function0[Unit]): Unit = js.native
  def doesNotThrow(block: js.Function0[Unit], error: js.Function0[Unit]): Unit = js.native
  def doesNotThrow(block: js.Function0[Unit], error: js.Function0[Unit], message: String): Unit = js.native
  def doesNotThrow(block: js.Function0[Unit], error: js.Function1[/* err */ js.Any, Boolean]): Unit = js.native
  def doesNotThrow(block: js.Function0[Unit], error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = js.native
  def doesNotThrow(block: js.Function0[Unit], error: RegExp): Unit = js.native
  def doesNotThrow(block: js.Function0[Unit], error: RegExp, message: String): Unit = js.native
  def doesNotThrow(block: js.Function0[Unit], message: String): Unit = js.native
  def equal(actual: js.Any, expected: js.Any): Unit = js.native
  def equal(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def fail(): Unit = js.native
  def fail(actual: js.Any): Unit = js.native
  def fail(actual: js.Any, expected: js.Any): Unit = js.native
  def fail(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def fail(actual: js.Any, expected: js.Any, message: String, operator: String): Unit = js.native
  def ifError(value: js.Any): Unit = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def ok(value: js.Any): Unit = js.native
  def ok(value: js.Any, message: String): Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def throws(block: js.Function0[Unit]): Unit = js.native
  def throws(block: js.Function0[Unit], error: js.Function0[Unit]): Unit = js.native
  def throws(block: js.Function0[Unit], error: js.Function0[Unit], message: String): Unit = js.native
  def throws(block: js.Function0[Unit], error: js.Function1[/* err */ js.Any, Boolean]): Unit = js.native
  def throws(block: js.Function0[Unit], error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = js.native
  def throws(block: js.Function0[Unit], error: RegExp): Unit = js.native
  def throws(block: js.Function0[Unit], error: RegExp, message: String): Unit = js.native
  def throws(block: js.Function0[Unit], message: String): Unit = js.native
}

