Write-Host "Start Aspose.Cells Cloud SDK for Java"
    $StartTime = Get-Date
    [string[]]$lines = mvn.cmd test
    $result = $false
    $passed = 0
    $total =0
    $failed = 0
    $skipped =0
    foreach($line in $lines)
    {
        if($line -match "Results :")
        {
            $result =  $true
        }
        if($result -and $line -match "Tests run: (\d+), Failures: (\d+), Errors: (\d+), Skipped: (\d+)")
        {
            $total=$matches[1]
            $passed=$matches[2]
            $failed=$matches[3]
            $skipped=$matches[4]
            break
        }
    }
    $failed = $failed + $passed
    $passed = $total -$failed -$skipped
    $EndTime = Get-Date
    $timespan ="{0:N2}" -f (New-TimeSpan $StartTime  $EndTime).TotalSeconds
    Write-Host "Spent ${timespan}s on finishing test. Result : Total ${total}, Passed ${passed} , Failed ${failed} ,Skipped ${skipped} ."
   