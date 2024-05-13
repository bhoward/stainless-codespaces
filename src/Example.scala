import stainless.annotation._
import stainless.collection._
import stainless.equations._
import stainless.lang._


def add(x: BigInt, y: BigInt): Int =
    require(x >= 0)
    require(y >= 0)
    x + y
