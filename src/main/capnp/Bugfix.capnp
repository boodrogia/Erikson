@0x8a4fdb40485958dd;

using Java = import "java.capnp";
$Java.package("org.ericsson2017.protocol.test");
$Java.outerClassname("BugfixClass");

struct Bugfix {
    bugs @0 : UInt8;
    message @1 : Text;
}

