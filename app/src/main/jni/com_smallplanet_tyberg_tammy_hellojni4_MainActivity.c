#include "com_smallplanet_tyberg_tammy_hellojni4_MainActivity.h"

JNIEXPORT jstring JNICALL Java_com_smallplanet_tyberg_tammy_hellojni4_MainActivity_getStringFromNative
        (JNIEnv* env, jclass class){
    return (*env) -> NewStringUTF(env, "With great C, comes java.");
}