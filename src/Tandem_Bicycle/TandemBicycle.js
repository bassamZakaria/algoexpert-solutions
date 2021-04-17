function tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest) {
    redShirtSpeeds.sort((a, b) => a - b);
    blueShirtSpeeds.sort((a, b) => a - b);
    let totalSpeed = 0;
    for (let i = 0; i < redShirtSpeeds.length; i++) {
        const rider1 = redShirtSpeeds[i];
        const rider2 = blueShirtSpeeds[fastest ? blueShirtSpeeds.length - 1 - i : i];
        totalSpeed += Math.max(rider1, rider2);
    }
    return totalSpeed;
}

const redShirtSpeeds = [5, 5, 3, 9, 2];
const blueShirtSpeeds = [3, 6, 7, 2, 1];

console.log(tandemBicycle(redShirtSpeeds, blueShirtSpeeds, true));